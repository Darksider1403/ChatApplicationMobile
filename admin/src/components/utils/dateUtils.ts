import moment from "node_modules/moment";
import "moment/locale/vi";

moment.locale("vi");

export const formatRelativeTime = (dateString: string): string => {
  return moment(dateString).fromNow();
};
export const formatDate = (date: string | Date): string => {
  return moment(date).format("[Ngày] DD [Tháng] MM [Năm] YYYY");
};
