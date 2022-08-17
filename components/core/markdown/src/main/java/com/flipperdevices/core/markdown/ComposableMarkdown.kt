package com.flipperdevices.core.markdown

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.flipperdevices.core.ui.theme.LocalPallet
import com.flipperdevices.core.ui.theme.LocalTypography
import com.mikepenz.markdown.compose.Markdown
import com.mikepenz.markdown.model.MarkdownColors
import com.mikepenz.markdown.model.MarkdownPadding
import com.mikepenz.markdown.model.MarkdownTypography

@Composable
fun ComposableMarkdown(
    modifier: Modifier = Modifier,
    content: String,
    typography: MarkdownTypography = markdownTypography(),
    colors: MarkdownColors = markdownColors()
) {
    Markdown(
        content = content,
        colors = colors,
        typography = typography,
        padding = markdownPadding(),
        modifier = modifier
    )
}

@Composable
fun markdownColors(
    backgroundCode: Color = LocalPallet.current.text20,
    text: Color = LocalPallet.current.text100
): MarkdownColors {
    return object : MarkdownColors {
        override val backgroundCode = backgroundCode
        override val text = text
    }
}

@Composable
fun markdownTypography(
    bulletStyle: TextStyle = LocalTypography.current.bodyR14,
    codeStyle: TextStyle = LocalTypography.current.bodyR14,
    h1Style: TextStyle = LocalTypography.current.bodySB14,
    h2Style: TextStyle = LocalTypography.current.bodySB14,
    h3Style: TextStyle = LocalTypography.current.bodySB14,
    h4Style: TextStyle = LocalTypography.current.bodySB14,
    h5Style: TextStyle = LocalTypography.current.bodySB14,
    h6Style: TextStyle = LocalTypography.current.bodySB14,
    listStyle: TextStyle = LocalTypography.current.bodyR14,
    orderedStyle: TextStyle = LocalTypography.current.bodyR14,
    paragraphStyle: TextStyle = LocalTypography.current.bodyR14,
    quoteStyle: TextStyle = LocalTypography.current.bodyR14,
    textStyle: TextStyle = LocalTypography.current.bodyR14
): MarkdownTypography {
    return object : MarkdownTypography {
        override val bullet = bulletStyle
        override val code = codeStyle
        override val h1 = h1Style
        override val h2 = h2Style
        override val h3 = h3Style
        override val h4 = h4Style
        override val h5 = h5Style
        override val h6 = h6Style
        override val list = listStyle
        override val ordered = orderedStyle
        override val paragraph = paragraphStyle
        override val quote = quoteStyle
        override val text = textStyle
    }
}

@Composable
fun markdownPadding(): MarkdownPadding {
    return object : MarkdownPadding {
        override val block: Dp
            get() = 2.dp
        override val indentList: Dp
            get() = 4.dp
        override val list: Dp
            get() = 1.dp
    }
}