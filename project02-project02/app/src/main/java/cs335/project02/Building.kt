package cs335.project02

class Building(private var name: String) {

    var rooms = mutableMapOf<Int, Room>()

    fun addRoom(roomKey : Int, newRoom : Room){
        rooms[roomKey] = newRoom
    }

    fun printDetail(){
        println("Building: $name")
        for(item in rooms.values){
            item.printDetail()
        }
    }
}



// Room Information
class Room(var roomNumber: Int,
           var occupantsCount: Int,
           var floorNumber: Int,
           var roomLeaderName: String,
           var status: RoomStatus) 
{
    fun printDetail()
    {
        println("Room: $roomNumber\tOccupant: $occupantsCount\tfloor: $floorNumber\tRoom leader: $roomLeaderName\tStatus: $status")
    }
}

/*class RoomStatus(s: String) {
    private var clean: String = "Clean"
    private var failedRoomInspection: String = "Failed Room Inspection"
    private var failedBathroomInspection: String = "Failed Bathroom Inspection"
    private var failedBothBathroomAndRoomInspection = "Failed Both Bathroom And Room Inspection"
}*/

/* create the objects to be called to change the room status */
enum class RoomStatus {
    Clean,
    FailedRoomInspection,
    FailedBathroomInspection,
    FailedBothBathroomAndRoomInspection
}

//for testing purpose
fun main() {
    val bradley = Building("Bradley")
    bradley.addRoom(4101, Room(4101, 4, 1, "Aurelia", RoomStatus.Clean))
    bradley.addRoom(4302, Room(4302, 4, 3, "Sue", RoomStatus.Clean))
    bradley.addRoom(4403, Room(4403, 4, 4, "Virginia", RoomStatus.Clean))
    bradley.addRoom(4504, Room(4504, 4, 5, "Jane", RoomStatus.Clean))
    bradley.addRoom(4106, Room(4106, 4, 1, "Eunice", RoomStatus.Clean))

    val pccDorms = Dorms()
    pccDorms.addBuilding("bradley", bradley)
    pccDorms.addBuilding("coberly", coberly)
    pccDorms.addBuilding("dixon", dixon)
    pccDorms.addBuilding("rice", rice)
    pccDorms.addBuilding("young", young)

    pccDorms.printDetail()
    println("--------------------------")
    // Update room status
    pccDorms.updateRoomStatus("bradley", 4302, RoomStatus.FailedBathroomInspection)

    pccDorms.printDetail()
    println("--------------------------")
}
