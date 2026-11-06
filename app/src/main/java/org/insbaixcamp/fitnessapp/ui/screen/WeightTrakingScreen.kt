package org.insbaixcamp.fitnessapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.insbaixcamp.fitnessapp.tools.CalcularImc
import org.insbaixcamp.fitnessapp.ui.theme.FitnessAppTheme

@Composable
fun WeightTrakingScreen(
    pesActual: Double,
    pesObjectiu: Double,
    altura: Int
) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.padding(top = 16.dp)) {
            Card(Modifier.weight(1f).padding(8.dp)) {
                Text(text = "Pes actual:")
                Text(text = "$pesActual")
            }
            Card(Modifier.weight(1f).padding(8.dp)) {
                Text(text = "Pes objectiu:")
                Text(text = "$pesObjectiu")
            }
            Card(Modifier.weight(1f).padding(8.dp)) {
                Text(text = "IMC: ")
                var imc = CalcularImc.calcularImc(pesActual, altura)
                Text(text = "$imc")

            }
        }
    }
}
    @Preview(showBackground = true)
    @Composable
    fun WeightTrakingScreenPreview() {
        FitnessAppTheme() {
        WeightTrakingScreen(70.0, 60.0, 170)
    }
}