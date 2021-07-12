import dagger.Provides
import dagger.multibindings.IntoSet
import javax.inject.Named

@dagger.Module
object FooModule {
    @Provides @IntoSet @Named("StuffSet")
    fun provideFoo(): String = "FOO!"
}