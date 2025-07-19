package uz.nodir.strategypattern.service.registry

import jakarta.annotation.PostConstruct
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import uz.nodir.strategypattern.model.enums.Processing
import uz.nodir.strategypattern.service.payment.PayService
import java.util.*
import kotlin.collections.HashMap


/**
@author: Nodir
@date: 19.07.2025
@group: Meloman

 **/

@Component
class PayRegistry(
    private val payServices: List<PayService>
) {

    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)
    }

    private val payServicesList: MutableMap<Processing, PayService> = EnumMap(Processing::class.java)


    @PostConstruct
    fun init() {
        registerPaymentServices()
    }

    fun registerPaymentServices() {
        log.info("Registering pay services")

        if (payServices.isEmpty()) {
            log.error("No pay services found")
            return
        }


        payServices.forEach {
            if (payServicesList[it.type()] != null) {
                val message = "Duplicate pay service ${it.type()} found"
                log.error(message)
                throw IllegalStateException(message)
            }

            log.info("Registered ${it.type()} pay service")
            payServicesList[it.type()] = it
        }

        log.info("Pay services registered")
    }


}