package br.com.jaqueline.oliveira.calculadoraflex.extentions

fun Double.format(digits: Int) =
        java.lang.String.format("%.${digits}f", this)