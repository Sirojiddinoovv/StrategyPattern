package uz.nodir.strategypattern.service.payment.impl

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import uz.nodir.strategypattern.model.dto.payment.request.PaymentRequestDTO
import uz.nodir.strategypattern.model.dto.payment.response.PaymentResponseDTO
import uz.nodir.strategypattern.service.payment.PayService
import kotlin.random.Random


/**
@author: Nodir
@date: 19.07.2025
@group: Meloman

 **/

@Service
class VisaPayServiceImpl: PayService {

    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)
    }

    override fun process(requestDTO: PaymentRequestDTO): PaymentResponseDTO {
        log.info("Received command to pay from VISA with request dto: $requestDTO")

        //todo business logic

        val response = PaymentResponseDTO(
            card = requestDTO.card,
            refNum = Random.nextInt(100000, 9999999)
        )

        log.info("Finished command to pay from VISA with response dto: $response")
        return response
    }
}