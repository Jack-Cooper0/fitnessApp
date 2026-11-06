package org.insbaixcamp.fitnessapp.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
    var nouPes : Double by remember { mutableStateOf(pesActual) }

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
        Text("Registra un nou pes")
        OutlinedTextField(
            value = nouPes.toString(),
            onValueChange = { nouPes = it.toDoubleOrNull()?: 0.0 },
            label = { Text("Pes (kg)") },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            )
        Button(onClick = {}, modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp))
        {
            Text("Guardar pes")
        }
        Text("Evolució de pes", modifier = Modifier.padding(start = 16.dp, end= 16.dp, top = 32.dp))
        Box(modifier = Modifier.fillMaxWidth().height(50.dp)){

        }
        Text("Ultims registres", modifier = Modifier.padding(start = 16.dp, end= 16.dp, top = 32.dp))
        LazyColumn(Modifier.fillMaxWidth().height(50.dp)){

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