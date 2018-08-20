package facade

class CPU {
    fun freeze() {}
    fun jump(position: Long) {}
    fun execute() {}
}

class HardDrive {
    fun read(lba: Long, size: Int): ByteArray {
        return byteArrayOf()
    }
}

class Memory {
    fun load(position: Long, data: ByteArray) {}
}

class ComputerFacade {

    private var processor = CPU()
    private var ram = Memory()
    private var hd = HardDrive()
    private val bootAddress = 2023L
    private val bootSector = 2341L
    private val sectorSize = 512

    fun start() {
        processor.freeze()
        ram.load(bootAddress, hd.read(bootSector, sectorSize))
        processor.jump(bootAddress)
        processor.execute()
    }
}


fun main(args: Array<String>) {
    val computer = ComputerFacade()
    computer.start()
}