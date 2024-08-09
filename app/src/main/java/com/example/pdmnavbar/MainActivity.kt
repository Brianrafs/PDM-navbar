import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallTopAppBarExample() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color(0xFF6200EA),  // Cor personalizada para o app bar
                    titleContentColor = Color.White,
                    actionIconContentColor = Color.White
                ),
                title = {
                    Text("Small Top App Bar")
                },
                actions = {
                    Icon(Icons.Filled.Info, contentDescription = "Info")
                }
            )
        },
    ) { innerPadding ->
        ScrollContent(innerPadding)
    }
}

@Composable
fun ScrollContent(innerPadding: PaddingValues) {
    // Usando uma Column com scroll
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Exemplo de conteúdo que pode rolar para baixo.",
            color = MaterialTheme.colorScheme.onBackground
        )

        FilledTonalButton(
            onClick = { },
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Icon(Icons.Filled.ThumbUp, contentDescription = "Like")
            Text(text = "Curtir")
        }
        Text(
            text = "Mais texto de exemplo...",
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "Ainda mais texto...",
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}

@Preview
@Composable
fun PreviewSmallTopAppBarExample() {
    SmallTopAppBarExample()
}
