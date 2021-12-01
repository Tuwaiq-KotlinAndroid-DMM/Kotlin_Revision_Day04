class Danar2(name: String): Building(name) {

    override fun nameOfBuilding(): String {
        return name
    }

    override fun noOfFloors(): Int {
        return 10
    }

    override fun noOfRooms(): Int {
        return 20
    }

    override fun noOfRestRooms(): Int {
        return 20
    }

    override fun isKidsPlayArea(): Boolean {
        return false
    }

    override fun area(): String {
        return "Al Rakah"
    }
}