fun main(args: Array<String>) {
    val adam = Player("Adam")
//    println(adam.name)
//    println(adam.lives)
//    println(adam.level)
//    println(adam.score)

    adam.show();

//    val louise = Player("Louise")
//    louise.level = 5
//    louise.show()
//
//    val link = Player("Link", 4, 8)
//    val ganon = Player("Ganon", 2, 5, 1000)
//    link.show()
//    ganon.show()
//    println(ganon.weapon.name.toUpperCase())
//    println(ganon.weapon.damageInflicted)
//
//    val axe = Weapon("Axe", 12)
//    link.weapon = axe
//    println(link.weapon.name)
//    println(link.weapon.damageInflicted)
//
//    axe.damageInflicted = 24
//    println(axe.damageInflicted)
//    println(link.weapon.damageInflicted)
//
//    louise.weapon = adam.weapon
//    louise.show()

    adam.weapon = Weapon("Dick", 69)
    println(adam.weapon.name)

    adam.show()

    println("=========================================================")

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    adam.getLoot(redPotion)

    val chestArmor = Loot("Chest Armor", LootType.ARMOR, 80.00)
    adam.getLoot(chestArmor)

    val hoes = Loot("Hoes", LootType.RING, 100.00)
    adam.getLoot(hoes)

    println(adam.toString())
    adam.showInventory()

    adam.dropLoot(hoes)
    adam.showInventory()
}
