class Groovylib {
    def name

    static Groovylib instantiate() {
        return new Groovylib()
    }

    def hello(String name) {
        this.name = name
        return "hello, $name"
    }

    def twoReturns() {
        return [1, 2]
    }

    def getName() {
        return name
    }
}

return Groovylib
