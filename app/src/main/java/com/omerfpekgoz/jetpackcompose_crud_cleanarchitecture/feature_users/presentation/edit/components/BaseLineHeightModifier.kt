package com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.presentation.edit.components

import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.*
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp

data class BaseLineHeightModifier(
    val heightFromBaseLine: Dp
) : LayoutModifier {
    override fun MeasureScope.measure(
        measurable: Measurable,
        constraints: Constraints
    ): MeasureResult {
        val textPlaceable = measurable.measure(constraints = constraints)
        val firstBaseLine = textPlaceable[FirstBaseline]
        val lastBaseLine = textPlaceable[LastBaseline]

        val height = heightFromBaseLine.roundToPx() + lastBaseLine - firstBaseLine
        return layout(constraints.maxWidth, height) {
            val topY = heightFromBaseLine.roundToPx() - firstBaseLine
            textPlaceable.place(0, topY)
        }
    }
}

fun Modifier.baseLineHeight(heightFromBaseLine: Dp): Modifier =
    this.then(BaseLineHeightModifier(heightFromBaseLine))
