import dagger.Provides
import dagger.multibindings.IntoSet
import dagger.multibindings.Multibinds
import javax.inject.Named

@dagger.Module(includes = [AppModule.AppModuleInner::class, FooModule::class])
abstract class AppModule {
    @Multibinds @Named("StuffSet")
    abstract fun provideStuffSet(): Set<String>

    @dagger.Module
    object AppModuleInner {
        @Provides @IntoSet @Named("StuffSet")
        fun provideBaz() = "BAZ!"
    }
}