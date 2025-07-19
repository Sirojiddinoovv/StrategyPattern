package uz.nodir.strategypattern.model.dto.payment.response

import com.fasterxml.jackson.annotation.JsonInclude


/**
@author: Nodir
@date: 19.07.2025
@group: Meloman

 **/

@JsonInclude(JsonInclude.Include.NON_NULL)
data class PaymentResponseDTO(
    val card: String,

    val refNum: Int,
) {
}