import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ListItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.homeworkfour_api_koin_nav.ui.data.di.viewModels.LocationsViewModel

@Composable
fun LocationsScreen(navController: NavController, viewModel: LocationsViewModel = hiltViewModel()) {
    val locations = viewModel.locations
    LazyColumn {
        items(locations) { location ->
            ListItem(
                modifier = Modifier.clickable {
                    navController.navigate("location_details/${location.id}")
                },
                headlineContent = { Text(location.name) }
            )
        }
    }
}
