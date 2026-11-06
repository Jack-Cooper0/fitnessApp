package org.insbaixcamp.fitnessapp.tools

import kotlin.math.round

class CalcularImc{
    companion object{
    fun calcularImc(pes: Double, altura: Int): Double {
        var alturaMetros = altura.toDouble() / 100
        return round(pes / (alturaMetros * alturaMetros)*100)/100
        }
    }
}