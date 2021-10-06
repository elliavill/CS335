package cs335.project02


//private val name: String = ""
// private var rooms = mutableMapOf<Int, Room>()
// for testing because no data class and no layout yet



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
class Room(
    var roomNumber: Int,
    var occupantsCount: Int,
    var floorNumber: Int,
    var roomLeaderName: String,
    var status: RoomStatus
) {


    fun printDetail(){
        println("Room: $roomNumber\tOccupant: $occupantsCount\tfloor: $floorNumber\tRoom leader: $roomLeaderName\tStatus: $status")
    }
}

/*class RoomStatus(s: String) {
    private var clean: String = "Clean"
    private var failedRoomInspection: String = "Failed Room Inspection"
    private var failedBathroomInspection: String = "Failed Bathroom Inspection"
    private var failedBothBathroomAndRoomInspection = "Failed Both Bathroom And Room Inspection"
}*/

/*for testing because no layout yet, use data class later
   create the objects to be called to set the room status */
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

    val coberly = Building("Coberly")
    coberly.addRoom(2101, Room(2101, 4, 1, "Matt", RoomStatus.Clean))
    coberly.addRoom(2302, Room(2302, 4, 3, "Kim", RoomStatus.Clean))
    coberly.addRoom(2403, Room(2403, 4, 4, "Nathan", RoomStatus.Clean))
    coberly.addRoom(2504, Room(2504, 4, 5, "Christ", RoomStatus.Clean))
    coberly.addRoom(2205, Room(2205, 4, 2, "Hartono", RoomStatus.Clean))

    val dixon = Building("Dixon")
    dixon.addRoom(5101, Room(5101, 4, 1, "Jayne", RoomStatus.Clean))
    dixon.addRoom(5302, Room(5302, 4, 3, "Ruby", RoomStatus.Clean))
    dixon.addRoom(5803, Room(5803, 4, 8, "Theresa", RoomStatus.Clean))
    dixon.addRoom(5204, Room(5204, 4, 2, "Sky", RoomStatus.Clean))
    dixon.addRoom(5305, Room(5305, 4, 3, "Lily", RoomStatus.Clean))

    val rice = Building("Rice")
    rice.addRoom(7101, Room(7101, 4, 1, "Carmen", RoomStatus.Clean))
    rice.addRoom(7502, Room(7502, 4, 5, "Edison", RoomStatus.Clean))
    rice.addRoom(7703, Room(7703, 4, 7, "Joe", RoomStatus.Clean))
    rice.addRoom(7904, Room(7904, 4, 9, "Eugene", RoomStatus.Clean))
    rice.addRoom(7105, Room(7105, 4, 1, "Julio", RoomStatus.Clean))

    val young = Building("Young")
    young.addRoom(6101, Room(6101, 4, 1, "John", RoomStatus.Clean))
    young.addRoom(6202, Room(6202, 4, 2, "Rick", RoomStatus.Clean))
    young.addRoom(6403, Room(6403, 4, 4, "Mike", RoomStatus.Clean))
    young.addRoom(6304, Room(6304, 4, 3, "Sam",  RoomStatus.Clean))
    young.addRoom(6205, Room(6205, 4, 2, "Ben", RoomStatus.Clean))


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
