package com.johncolani.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.johncolani.newsapp.R

data class Page(
    val title : String,
    val description : String,
    @DrawableRes val image: Int
)
val pages = listOf(
    Page(
        title = "Loream Ipsun is simply dummy",
        description = "Loream Ipsun is simply dummy Loream Ipsun is simply dummy",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Loream Ipsun is simply dummy",
        description = "Loream Ipsun is simply dummy Loream Ipsun is simply dummy",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Loream Ipsun is simply dummy",
        description = "Loream Ipsun is simply dummy Loream Ipsun is simply dummy",
        image = R.drawable.onboarding3
    ),
)
