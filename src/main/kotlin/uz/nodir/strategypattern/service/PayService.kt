package uz.nodir.strategypattern.service

import jakarta.validation.constraints.NotNull
import uz.nodir.strategypattern.model.dto.payment.request.PaymentRequestDTO
import uz.nodir.strategypattern.model.dto.payment.response.PaymentResponseDTO


/**
@author: Nodir
@date: 19.07.2025
@group: Meloman

 **/

interface PayService {

    fun process(@NotNull requestDTO: PaymentRequestDTO): PaymentResponseDTO
}