
fun main() {
    println("Time to learn u a Dagger")

    val appComponent = DaggerAppComponent.builder().build()

    println(appComponent.getStuffSet())
}