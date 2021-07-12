import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    @Named("StuffSet") fun getStuffSet(): Set<String>

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
    }
}