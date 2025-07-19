package uz.nodir.strategypattern.service.debit

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import uz.nodir.strategypattern.model.dto.payment.request.PaymentRequestDTO
import uz.nodir.strategypattern.model.dto.payment.response.PaymentResponseDTO
import uz.nodir.strategypattern.service.registry.PayRegistry


/**
@author: Nodir
@date: 19.07.2025
@group: Meloman

 **/

@Service
class DebitService(
    private val payRegistry: PayRegistry
) {

    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)
    }

    fun pay(requestDTO: PaymentRequestDTO): PaymentResponseDTO {
        log.info("Starting debit service with request dto: $requestDTO")

        val payService = payRegistry.getServiceByType(requestDTO.pc)

        val payResult = payService.process(requestDTO)

        log.info("Debit service end with request dto: $payResult")
        return payResult
    }
}