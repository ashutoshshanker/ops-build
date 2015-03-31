# Copyright (C) 2014 Hewlett-Packard Development Company, L.P.
# All Rights Reserved.
#
# The contents of this software are proprietary and confidential to the
# Hewlett-Packard Development Company, L. P.  No part of this program may be.
# photocopied, reproduced, or translated into another programming language.
# without prior written consent of the Hewlett-Packard Development Co., L. P.

DISTRO_KERNEL_FILE = $(BASE_BZIMAGE_FILE)
DISTRO_FS_FILE = $(BASE_OVA_FILE)
DISTRO_EXTRA_FS_FILES = $(BASE_BOX_FILE)
DISTRO_FS_TARGET = openhalon-appliance-image

# For this platform we create a itb image that includes a kernel, fs and dtb
all:: kernel fs

