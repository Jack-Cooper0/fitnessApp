package org.insbaixcamp.fitnessapp

import org.insbaixcamp.fitnessapp.tools.CalcularImc
import org.junit.Assert.*
import org.junit.Test

class CalcularImcTest {
    @Test
    fun calcularImcPesNormal(){
        val pesActual = 70.0
        val altura = 170
        val imc= CalcularImc.calcularImc(pesActual, altura)
        assertEquals(24.22, imc, 0.1)
    }
    @Test
    fun calcularImcPesInferiorCero(){
        val pesActual = -1.0
        val altura = 170
        val imc= CalcularImc.calcularImc(pesActual, altura)
        assertEquals(0.0, imc, 0.1)
    }
    @Test
    fun calcularImcAlturaInferiorCero(){
        val pesActual = 70.0
        val altura = -1
        val imc= CalcularImc.calcularImc(pesActual, altura)
        assertEquals(0.0, imc, 0.1)

        }
}