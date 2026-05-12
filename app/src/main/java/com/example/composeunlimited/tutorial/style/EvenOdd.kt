package com.example.composeunlimited.tutorial.style

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

class EvenOdd : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        return TransformedText(
            text = buildAnnotatedString {
                text.forEachIndexed { index, char ->
                    if (index % 2 == 0) {
                        append(char.uppercase())
                    } else {
                        append(char.lowercase())
                    }
                }
            },
            offsetMapping = OffsetMapping.Identity
        )
    }
}