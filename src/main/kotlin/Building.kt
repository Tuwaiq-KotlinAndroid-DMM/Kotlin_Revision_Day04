open class Building(var name: String): IBuilding {

    override fun nameOfBuilding(name: String): String{
        return name
    }

    override fun noOfFloors(): Int {
        return 2
    }

    override fun noOfRooms(): Int {
        return 10
    }

    override fun noOfRestRooms(): Int {
        return 10
    }

    override fun isKidsPlayArea(): Boolean {
        return true
    }

    override fun area(): String {
        return "Al Olaya"
    }

    override fun city(): String {
        return "Dammam"
    }

    override fun country(): String {
        return "Saudi Arabia"
    }

}