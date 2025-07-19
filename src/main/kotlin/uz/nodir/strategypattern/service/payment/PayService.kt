package uz.nodir.strategypattern.service.payment

import jakarta.validation.constraints.NotNull
import uz.nodir.strategypattern.model.dto.payment.request.PaymentRequestDTO
import uz.nodir.strategypattern.model.dto.payment.response.PaymentResponseDTO
import uz.nodir.strategypattern.model.enums.Processing


/**
@author: Nodir
@date: 19.07.2025
@group: Meloman

 **/

interface PayService {

    fun process(@NotNull requestDTO: PaymentRequestDTO): PaymentResponseDTO

    fun type(): Processing
}