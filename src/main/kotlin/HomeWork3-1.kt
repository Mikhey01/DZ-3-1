val seconds = 720

val secondsOnMinute = 60                    //60 секунд в минуте
val secondsOnHour = secondsOnMinute * 60      //3600 секунд в 1 часе
val secondsOnToday = secondsOnHour * 24         //86 400 секунд в 1 дне
val secondsOnYesteday = secondsOnToday * 2        // 172800 секунд в 2 днях
val secondsOnLongAgo = secondsOnToday * 3         //259 200 секунд в 3 днях
val minutes = seconds / secondsOnMinute
val hour = seconds / secondsOnHour
val second = "секунд"
val today = "сегодня"
val yesterday = "вчера"
val longAgo = "давно"

val check = if (minutes % 10 === 1) "минуту" else if (minutes % 10 === 2
    || minutes % 10 === 3 || minutes % 10 === 4) "минуты" else "минут"

val minutesName = when (minutes) {
    1 -> "минуту"
    11, 12, 13, 14 -> "минут"
    else -> check
}

val hours = when (hour) {
    1, 21 -> "час"
    2, 3, 4, 22, 23, 24 -> "часа"
    else -> "часов"
}

val time = when {
    (seconds > secondsOnMinute && seconds <= secondsOnHour) -> minutesName
    (seconds > secondsOnHour && seconds <= secondsOnToday) -> hours
    (seconds > secondsOnToday && seconds <= secondsOnYesteday) -> today
    (seconds > secondsOnYesteday && seconds <= secondsOnLongAgo) -> yesterday
    (seconds > secondsOnLongAgo) -> longAgo
    else -> second
}

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

fun main() {
    agoToText()
}