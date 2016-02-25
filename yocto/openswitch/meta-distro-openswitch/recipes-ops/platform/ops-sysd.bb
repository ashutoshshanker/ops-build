SUMMARY = "OpenSwitch System Daemon (sysd)"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "ops-utils ops-config-yaml ops-ovsdb ops-cli"
RDEPENDS_${PN} = "dmidecode"

SRC_URI = "git://git.openswitch.net/openswitch/ops-sysd;protocol=https \
           file://ops-sysd.service \
"

SRCREV = "2f06526e4e670f1bfc7d201a0a11b95a2bc02889"

# When using AUTOREV, we need to force the package version to the revision of git
# in order to avoid stale shared states.
PV = "git${SRCPV}"

S = "${WORKDIR}/git"

do_install_append() {
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/ops-sysd.service ${D}${systemd_unitdir}/system
}

FILES_${PN} += "/usr/lib/cli/plugins/"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "ops-sysd.service"

inherit openswitch cmake systemd pkgconfig
