class Danar4(name: String): Building(name) {
    override fun nameOfBuilding(): String {
        return name
    }

    override fun noOfFloors(): Int {
        return 30
    }

    override fun noOfRooms(): Int {
        return 60
    }

    override fun noOfRestRooms(): Int {
        return 60
    }

    override fun isKidsPlayArea(): Boolean {
        return true
    }

    override fun area(): String {
        return "Dhahran"
    }
}