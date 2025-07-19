package uz.nodir.strategypattern.controller

import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import uz.nodir.strategypattern.model.dto.payment.request.PaymentRequestDTO
import uz.nodir.strategypattern.service.debit.DebitService


/**
@author: Nodir
@date: 19.07.2025
@group: Meloman

 **/

@RestController
@RequestMapping("/api/v1/debit")
class DebitController(
    private val debitService: DebitService
) {

    @PostMapping
    fun pay(@RequestBody @Valid requestDTO: PaymentRequestDTO) =
        ResponseEntity.ok(debitService.pay(requestDTO))
}