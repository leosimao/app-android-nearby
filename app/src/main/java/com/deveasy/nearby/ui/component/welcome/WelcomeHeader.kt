package com.deveasy.nearby.ui.component.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.deveasy.nearby.R
import com.deveasy.nearby.ui.theme.Gray500
import com.deveasy.nearby.ui.theme.Gray600
import com.deveasy.nearby.ui.theme.Typography

@Composable
fun WelcomeHeader(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
    ) {
        Image(
            painter = painterResource(R.drawable.img_logo_logo_icon),
            contentDescription = "Logotipo image app"
        )
        Spacer(modifier = Modifier.height(28.dp))
        Text(
            text = "Boas vindas ao Nearby!",
            style = Typography.headlineLarge,
            color = Gray600
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Tenha cupons de vantagem para user em seus estabelecimentos favoritos",
            style = Typography.bodyLarge,
            color = Gray500
        )
    }
}
