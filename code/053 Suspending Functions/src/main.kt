import kotlinx.coroutines.*

fun main() = runBlocking {
    printer()
    println("\nMain finished.")
}

suspend fun printer() = coroutineScope {

    val jobs = mutableListOf<Job>()

    repeat(10_000) {
        val job = launch {
            delay(1000L)
            if(it % 50 == 0) println()
            print(".")
        }

        jobs.add(job)
    }

    for(job in jobs) {
        job.join()
    }

    println("\nPrinter finished.")
}