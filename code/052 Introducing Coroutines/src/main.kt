import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Start 1: ${Thread.currentThread().name}")
    println("Hello")

    launch {
        println("Start 2: ${Thread.currentThread().name}")
        delay(2000L)
        println("Hello from 2")
        println("End 2: ${Thread.currentThread().name}")
    }

    launch {
        println("Start 3: ${Thread.currentThread().name}")
        println("Hello from 3")
        println("End 3: ${Thread.currentThread().name}")
    }

    println("End 1: ${Thread.currentThread().name}")
}

fun test() = runner {
    println("Hi")
}

fun runner(action: ()->Unit) {
    action()
}
