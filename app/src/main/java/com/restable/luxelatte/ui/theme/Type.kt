package com.restable.luxelatte.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp
import com.restable.luxelatte.R

val kaushanScriptFont = FontFamily(Font(R.font.kaushan_script_regular, FontWeight.Bold))
val interFont = FontFamily(Font(R.font.inter_regular, FontWeight.Bold))

val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = kaushanScriptFont,
        fontWeight = FontWeight.W400,
        fontSize = 48.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.5.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Proportional,
            trim = LineHeightStyle.Trim.Both
        ),
        platformStyle = PlatformTextStyle(includeFontPadding = true)
    ),

    bodyLarge = TextStyle(
        fontFamily = interFont, fontWeight = FontWeight.W400, fontSize = 20.sp,
        lineHeight = 22.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = interFont, fontWeight = FontWeight.W400, fontSize = 15.sp,
        lineHeight = 22.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = interFont, fontWeight = FontWeight.W400, fontSize = 12.sp,
        lineHeight = 22.sp,
    ),
)