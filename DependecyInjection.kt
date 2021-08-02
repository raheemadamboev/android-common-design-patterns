/**
 * Dependency injection pattern -> Hilt Dependency Injection framework used here
 */
@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Singleton
    @Provides
    fun provideHamburger() = Hamburger.Builder()
        .cheese(true)
        .beef(false)
        .onions(true)
        .build()
}
