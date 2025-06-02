package kr.ac.kumoh.ce.s20220795.mysql_robot

import org.springframework.stereotype.Service


@Service
class RobotService(val repository: RobotRepository){
    fun getAllRobots(): List<Robot> = repository.findAll()

    fun getRobotWithWeapons(): List<EquipmentDto>{
        return repository.findAllEquipment()
    }
}