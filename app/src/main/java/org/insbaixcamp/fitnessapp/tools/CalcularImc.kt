package org.insbaixcamp.fitnessapp.tools

import kotlin.math.round

class CalcularImc{
    companion object{
    fun calcularImc(pes: Double, altura: Int): Double {
        if(pes <= 0 || altura <= 0){
            return 0.0
        }
        var alturaMetros = altura.toDouble() / 100
        return round(pes / (alturaMetros * alturaMetros)*100)/100
        }
    }
}