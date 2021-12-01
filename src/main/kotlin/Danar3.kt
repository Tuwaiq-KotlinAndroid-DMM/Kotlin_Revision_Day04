class Danar3(name: String) : Building(name) {

    override fun nameOfBuilding(): String {
        return name
    }

    override fun noOfFloors(): Int {
        return 20
    }

    override fun noOfRooms(): Int {
        return 40
    }

    override fun noOfRestRooms(): Int {
        return 40
    }

    override fun isKidsPlayArea(): Boolean {
        return true
    }

    override fun area(): String {
        return "Al Thuqbah"
    }
}