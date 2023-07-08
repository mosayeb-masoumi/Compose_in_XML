package com.example.composeinfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.navigation.Navigation

class DetailFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        return inflater.inflate(R.layout.fragment_detail, container, false)
        return ComposeView(requireContext()).apply {

            setContent {
                MyButton(view)
            }
        }
    }
}

@Composable
fun MyButton(view: View?) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue.copy(alpha = 0.4f)),
        contentAlignment = Alignment.Center
    ) {

        Button(onClick = {
            view?.let {
                Navigation.findNavController(view)
                    .navigate(R.id.action_detailFragment_to_homeFragment)
            }

        }) {
             Text(text = "go to home")
        }
    }
}