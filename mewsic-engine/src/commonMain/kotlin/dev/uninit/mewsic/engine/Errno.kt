package dev.uninit.mewsic.engine

enum class Errno(val errCode: Int) {
    OK(0),                  // Success
    EPERM(1),               // Not super-user
    ENOENT(2),              // No such file or directory
    ESRCH(3),               // No such process
    EINTR(4),               // Interrupted system call
    EIO(5),                 // I/O error
    ENXIO(6),               // No such device or address
    E2BIG(7),               // Arg list too long
    ENOEXEC(8),             // Exec format error
    EBADF(9),               // Bad file number
    ECHILD(10),             // No children
    EAGAIN(11),             // No more processes
    EWOULDBLOCK(11),
    ENOMEM(12),             // Not enough core
    EACCES(13),             // Permission denied
    EFAULT(14),             // Bad address
    ENOTBLK(15),            // Block device required
    EBUSY(16),              // Mount device busy
    EEXIST(17),             // File exists
    EXDEV(18),              // Cross-device link
    ENODEV(19),             // No such device
    ENOTDIR(20),            // Not a directory
    EISDIR(21),             // Is a directory
    EINVAL(22),             // Invalid argument
    ENFILE(23),             // Too many open files in system
    EMFILE(24),             // Too many open files
    ENOTTY(25),             // Not a typewriter
    ETXTBSY(26),            // Text file busy
    EFBIG(27),              // File too large
    ENOSPC(28),             // No space left on device
    ESPIPE(29),             // Illegal seek
    EROFS(30),              // Read only file system
    EMLINK(31),             // Too many links
    EPIPE(32),              // Broken pipe
    EDOM(33),               // Math arg out of domain of func
    ERANGE(34),             // Math result not representable
    ENOMSG(35),             // No message of desired type
    EIDRM(36),              // Identifier removed
    ECHRNG(37),             // Channel number out of range
    EL2NSYNC(38),           // Level 2 not synchronized
    EL3HLT(39),             // Level 3 halted
    EL3RST(40),             // Level 3 reset
    ELNRNG(41),             // Link number out of range
    EUNATCH(42),            // Protocol driver not attached
    ENOCSI(43),             // No CSI structure available
    EL2HLT(44),             // Level 2 halted
    EDEADLK(45),            // Deadlock condition
    ENOLCK(46),             // No record locks available

    EBADE(50),              // Invalid exchange
    EBADR(51),              // Invalid request descriptor
    EXFULL(52),             // Exchange full
    ENOANO(53),             // No anode
    EBADRQC(54),            // Invalid request code
    EBADSLT(55),            // Invalid slot
    EDEADLOCK(56),          // File locking deadlock error
    EBFONT(57),             // Bad font file fmt


    ENOSTR(60),             // Device not a stream
    ENODATA(61),            // No data (for no delay io)
    ETIME(62),              // Timer expired
    ENOSR(63),              // Out of streams resources
    ENONET(64),             // Machine is not on the network
    ENOPKG(65),             // Package not installed
    EREMOTE(66),            // The object is remote
    ENOLINK(67),            // The link has been severed
    EADV(68),               // Advertise error
    ESRMNT(69),             // Srmount error
    ECOMM(70),              // Communication error on send
    EPROTO(71),             // Protocol error


    EMULTIHOP(74),          // Multihop attempted
    ELBIN(75),              // Inode is remote (not really error)
    EDOTDOT(76),            // Cross mount point (not really error)
    EBADMSG(77),            // Trying to read unreadable message

    EFTYPE(79),             // Inappropriate file type or format
    ENOTUNIQ(80),           // Given log. name not unique
    EBADFD(81),             // f.d. invalid for this operation
    EREMCHG(82),            // Remote address changed
    ELIBACC(83),            // Can't access a needed shared lib
    ELIBBAD(84),            // Accessing a corrupted shared lib
    ELIBSCN(85),            // .lib section in a.out corrupted
    ELIBMAX(86),            // Attempting to link in too many libs
    ELIBEXEC(87),           // Attempting to exec a shared library
    ENOSYS(88),             // Function not implemented
    ENMFILE(89),            // No more files
    ENOTEMPTY(90),          // Directory not empty
    ENAMETOOLONG(91),       // File or path name too long
    ELOOP(92),              // Too many symbolic links


    EOPNOTSUPP(95),         // Operation not supported on transport endpoint
    EPFNOSUPPORT(96),       // Protocol family not supported







    ECONNRESET(104),        // Connection reset by peer
    ENOBUFS(105),           // No buffer space available
    EAFNOSUPPORT(106),      // Address family not supported by protocol family
    EPROTOTYPE(107),        // Protocol wrong type for socket
    ENOTSOCK(108),          // Socket operation on non-socket
    ENOPROTOOPT(109),       // Protocol not available
    ESHUTDOWN(110),         // Can't send after socket shutdown
    ECONNREFUSED(111),      // Connection refused
    EADDRINUSE(112),        // Address already in use
    ECONNABORTED(113),      // Connection aborted
    ENETUNREACH(114),       // Network is unreachable
    ENETDOWN(115),          // Network interface is not configured
    ETIMEDOUT(116),         // Connection timed out
    EHOSTDOWN(117),         // Host is down
    EHOSTUNREACH(118),      // Host is unreachable
    EINPROGRESS(119),       // Connection already in progress
    EALREADY(120),          // Socket already connected
    EDESTADDRREQ(121),      // Destination address required
    EMSGSIZE(122),          // Message too long
    EPROTONOSUPPORT(123),   // Unknown protocol
    ESOCKTNOSUPPORT(124),   // Socket type not supported
    EADDRNOTAVAIL(125),     // Address not available
    ENETRESET(126),
    EISCONN(127),           // Socket is already connected
    ENOTCONN(128),          // Socket is not connected
    ETOOMANYREFS(129),
    EPROCLIM(130),
    EUSERS(131),
    EDQUOT(132),
    ESTALE(133),
    ENOTSUP(134),           // Not supported
    ENOMEDIUM(135),         // No medium (in tape drive)
    ENOSHARE(136),          // No such host or network path
    ECASECLASH(137),        // Filename exists with different case
    EILSEQ(138),
    EOVERFLOW(139),         // Value too large for defined data type

    // CUSTOM
}
