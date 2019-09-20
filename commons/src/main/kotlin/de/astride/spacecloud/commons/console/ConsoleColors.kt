/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.console

/*
 * Created on 20.09.2019 19:02.
 * @author Lars Artmann | LartyHD
 */

private const val PREFIX = "\u001B["
private const val SUFFIX = "m"

const val RESET = "${PREFIX}0$SUFFIX"  // Text Reset
const val BOLD = "${PREFIX}1$SUFFIX"
const val FAINT = "${PREFIX}2$SUFFIX"
const val ITALIC = "${PREFIX}3$SUFFIX"
const val UNDERLINE = "${PREFIX}4$SUFFIX"
const val SLOW_BLINK = "${PREFIX}5$SUFFIX"
const val RAPID_BLINK = "${PREFIX}6$SUFFIX"
const val INVERSE = "${PREFIX}7$SUFFIX"
const val CONCEAL = "${PREFIX}8$SUFFIX"
const val STRIKETHROUGH = "${PREFIX}9$SUFFIX"

// Regular Colors
const val BLACK = "${PREFIX}0;30$SUFFIX"   // BLACK
const val RED = "${PREFIX}0;31$SUFFIX"     // RED
const val GREEN = "${PREFIX}0;32$SUFFIX"   // GREEN
const val YELLOW = "${PREFIX}0;33$SUFFIX"  // YELLOW
const val BLUE = "${PREFIX}0;34$SUFFIX"    // BLUE
const val PURPLE = "${PREFIX}0;35$SUFFIX"  // PURPLE
const val CYAN = "${PREFIX}0;36$SUFFIX"    // CYAN
const val WHITE = "${PREFIX}0;37$SUFFIX"   // WHITE

// Bold
const val BLACK_BOLD = "${PREFIX}1;30$SUFFIX"  // BLACK
const val RED_BOLD = "${PREFIX}1;31$SUFFIX"    // RED
const val GREEN_BOLD = "${PREFIX}1;32$SUFFIX"  // GREEN
const val YELLOW_BOLD = "${PREFIX}1;33$SUFFIX" // YELLOW
const val BLUE_BOLD = "${PREFIX}1;34$SUFFIX"   // BLUE
const val PURPLE_BOLD = "${PREFIX}1;35$SUFFIX" // PURPLE
const val CYAN_BOLD = "${PREFIX}1;36$SUFFIX"   // CYAN
const val WHITE_BOLD = "${PREFIX}1;37$SUFFIX"  // WHITE

// Underline
const val BLACK_UNDERLINED = "${PREFIX}4;30$SUFFIX"  // BLACK
const val RED_UNDERLINED = "${PREFIX}4;31$SUFFIX"    // RED
const val GREEN_UNDERLINED = "${PREFIX}4;32$SUFFIX"  // GREEN
const val YELLOW_UNDERLINED = "${PREFIX}4;33$SUFFIX" // YELLOW
const val BLUE_UNDERLINED = "${PREFIX}4;34$SUFFIX"   // BLUE
const val PURPLE_UNDERLINED = "${PREFIX}4;35$SUFFIX" // PURPLE
const val CYAN_UNDERLINED = "${PREFIX}4;36$SUFFIX"   // CYAN
const val WHITE_UNDERLINED = "${PREFIX}4;37$SUFFIX"  // WHITE

// Background
const val BLACK_BACKGROUND = "${PREFIX}40$SUFFIX"  // BLACK
const val RED_BACKGROUND = "${PREFIX}41$SUFFIX"    // RED
const val GREEN_BACKGROUND = "${PREFIX}42$SUFFIX"  // GREEN
const val YELLOW_BACKGROUND = "${PREFIX}43$SUFFIX" // YELLOW
const val BLUE_BACKGROUND = "${PREFIX}44$SUFFIX"   // BLUE
const val PURPLE_BACKGROUND = "${PREFIX}45$SUFFIX" // PURPLE
const val CYAN_BACKGROUND = "${PREFIX}46$SUFFIX"   // CYAN
const val WHITE_BACKGROUND = "${PREFIX}47$SUFFIX"  // WHITE

// High Intensity
const val BLACK_BRIGHT = "${PREFIX}0;90$SUFFIX"  // BLACK
const val RED_BRIGHT = "${PREFIX}0;91$SUFFIX"    // RED
const val GREEN_BRIGHT = "${PREFIX}0;92$SUFFIX"  // GREEN
const val YELLOW_BRIGHT = "${PREFIX}0;93$SUFFIX" // YELLOW
const val BLUE_BRIGHT = "${PREFIX}0;94$SUFFIX"   // BLUE
const val PURPLE_BRIGHT = "${PREFIX}0;95$SUFFIX" // PURPLE
const val CYAN_BRIGHT = "${PREFIX}0;96$SUFFIX"   // CYAN
const val WHITE_BRIGHT = "${PREFIX}0;97$SUFFIX"  // WHITE

// Bold High Intensity
const val BLACK_BOLD_BRIGHT = "${PREFIX}1;90$SUFFIX" // BLACK
const val RED_BOLD_BRIGHT = "${PREFIX}1;91$SUFFIX"   // RED
const val GREEN_BOLD_BRIGHT = "${PREFIX}1;92$SUFFIX" // GREEN
const val YELLOW_BOLD_BRIGHT = "${PREFIX}1;93$SUFFIX"// YELLOW
const val BLUE_BOLD_BRIGHT = "${PREFIX}1;94$SUFFIX"  // BLUE
const val PURPLE_BOLD_BRIGHT = "${PREFIX}1;95$SUFFIX" // PURPLE
const val CYAN_BOLD_BRIGHT = "${PREFIX}1;96$SUFFIX"  // CYAN
const val WHITE_BOLD_BRIGHT = "${PREFIX}1;97$SUFFIX" // WHITE

// High Intensity backgrounds
const val BLACK_BACKGROUND_BRIGHT = "${PREFIX}0;100$SUFFIX"// BLACK
const val RED_BACKGROUND_BRIGHT = "${PREFIX}0;101$SUFFIX"// RED
const val GREEN_BACKGROUND_BRIGHT = "${PREFIX}0;102$SUFFIX"// GREEN
const val YELLOW_BACKGROUND_BRIGHT = "${PREFIX}0;103$SUFFIX"// YELLOW
const val BLUE_BACKGROUND_BRIGHT = "${PREFIX}0;104$SUFFIX"// BLUE
const val PURPLE_BACKGROUND_BRIGHT = "${PREFIX}0;105$SUFFIX" // PURPLE
const val CYAN_BACKGROUND_BRIGHT = "${PREFIX}0;106$SUFFIX"  // CYAN
const val WHITE_BACKGROUND_BRIGHT = "${PREFIX}0;107$SUFFIX"   // WHITE


fun String.stripColors(): String = replace("\u001B((?i)[0-9a-fk-or])", "");