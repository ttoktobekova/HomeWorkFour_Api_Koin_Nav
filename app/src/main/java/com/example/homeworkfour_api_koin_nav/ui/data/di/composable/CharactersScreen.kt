import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.homeworkfour_api_koin_nav.ui.data.di.viewModels.CharactersViewModel

@Composable
fun CharactersScreen(navController: NavController, viewModel: CharactersViewModel = hiltViewModel()) {
    val characters = viewModel.characters

    LazyColumn {
        items(characters) { character ->
            ListItem(
                modifier = Modifier.clickable {
                    navController.navigate("character_details/${character.id}")
                },
                headlineContent = { Text(character.name) },
                leadingContent = {
                    AsyncImage(model = character.image, contentDescription = null)
                }
            )
        }
    }
}
