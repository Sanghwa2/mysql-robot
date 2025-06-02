package kr.ac.kumoh.ce.s20220795.mysql_robot

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RobotRepository : JpaRepository<Robot, Int> {
}