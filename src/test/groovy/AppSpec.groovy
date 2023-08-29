import com.test.App
import spock.lang.Specification

class AppSpec extends Specification {
    App app

    def setup() {
        app = new App()
    }

    def "call main method"() {
        given:
        String[] arr = new String[1]
        arr[0] = "argument"
        when:
        app.main(arr)

        then:
        0 * app.main(_) >> void
    }
}
