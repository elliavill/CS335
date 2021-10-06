package cs335.project02

class Dorms {
    var buildings = mutableMapOf<String, Building>() // for testing because no data class and no layout yet

    fun addBuilding(buildingName : String, newBuilding : Building){
        buildings[buildingName] = newBuilding
    }

    fun printDetail(){
        for(buildings in buildings.values){
            buildings.printDetail();
        }
    }

    fun updateRoomStatus(buildingName : String, room : Int, newStatus : RoomStatus){
        var buildingToUpdate = buildings[buildingName]

        // Set new room status
        var roomToUpdate = buildingToUpdate?.rooms?.get(room)
        roomToUpdate?.status = newStatus
    }
}