import Modal from '@/layout/Modal';

export default function homeLayout({
    children,
}: Readonly<{
    children: React.ReactNode;
}>) {
    return <Modal.Provider>{children}</Modal.Provider>;
}
