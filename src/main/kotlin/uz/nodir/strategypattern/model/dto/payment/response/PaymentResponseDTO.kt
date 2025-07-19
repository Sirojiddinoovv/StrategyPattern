package uz.nodir.strategypattern.model.dto.payment.response

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import uz.nodir.strategypattern.utils.CardUtils


/**
@author: Nodir
@date: 19.07.2025
@group: Meloman

 **/

@JsonInclude(JsonInclude.Include.NON_NULL)
data class PaymentResponseDTO(
    @JsonIgnore
    val originalCard: String,

    val refNum: Int,
) {

    @get:JsonProperty("card")
    val card = CardUtils.maskPan(originalCard)
}