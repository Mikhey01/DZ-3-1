fun main() {
    val seconds = 55
    val minutes = seconds / 60
    val hour = seconds / 3_600
    val second = "секунд"
    val minutesName = when (minutes) {
        1 -> "минуту"
        2, 3, 4, 12, 13, 14, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> "минуты"
        else -> "минуту"
    }
    val hours = when (hour) {
        1, 21 -> "час"
        2, 3, 4, 22, 23, 24 -> "часа"
        else -> "часов"
    }
    val today = "сегодня"
    val yesterday = "вчера"
    val longAgo = "давно"


    val time = if (seconds > 61 && seconds <= 3_600) minutesName else if (seconds > 3_600 && seconds <= 86_400) hours
    else if (seconds > 86_400 && seconds <= 172_800) today else if (seconds > 172_800 && seconds <= 259_200) yesterday
    else if (seconds > 259_200) longAgo else second


    fun agoToText() {
        when (time) {
            second -> println("Был(а) только что")
            minutesName -> println("Был(а) в сети $minutes $minutesName назад")
            hours -> println("Был(а) в сети $hour $hours назад")
            today -> println("Был(а) в сети $today")
            yesterday -> println("Был(а) в сети $yesterday")
            longAgo -> println("Был(а) в сети $longAgo")
        }
    }
    agoToText()
}