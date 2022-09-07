class Weapon (val name: String, var damageInflicted: Int) {

    override fun toString(): String {
        return """
            Name: $name
            Damage Inflicted: $damageInflicted
            ===================================
            """
    }
}