package com.example.condosa_registrar_recaudacionbackend.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@Setter
@Getter
public class MantenimientoReciboDto {

    private Integer idMantRecibo;
    private String estadoRecibo;
    private BigDecimal importe;

    public MantenimientoReciboDto(){}
}
