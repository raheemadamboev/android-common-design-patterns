/**
 * Facade pattern -> Used to hide more complex code using interface mask
 */

 interface RetrofitApi {

    @GET("hamburgers")
    suspend fun getHamburgers(): List<Hamburger>()
 }
