package uz.nodir.strategypattern.model.dto.payment.request

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import uz.nodir.strategypattern.model.enums.Processing


/**
@author: Nodir
@date: 19.07.2025
@group: Meloman

 **/

data class PaymentRequestDTO(
    @field:NotNull
    val pc: Processing,

    @field:NotBlank
    val card: String,

    @field:NotNull
    @field:Min(1L)
    val amount: Long = 0L
) {
}