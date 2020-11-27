package models

case class User(userName: String, password: String, connectedDevices: Option[List[ConnectedDevice]], animations: Option[List[Animation]])